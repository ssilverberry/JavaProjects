"""
Get current explorer values from SherloXplorer (via environment)
"""

# Purpose: This module gets shipped with the N++ plug-in 'SherloXplorer',
#          which is the front-end of a file explorer component.
# Author : UFO-Pu55y
# Version: 1.0

import ctypes

__all__ = ['getCurrentFolder', 'getCurrentFile']


def _getEnvVar(var):
    # os.environ wouldn't do the trick for us, since it's only accessing
    # the mapped (at startup) environment of the C++ runtime - so we'll
    # directly use some Win32 stuff
    num = ctypes.windll.kernel32.GetEnvironmentVariableA(var, None, 0)
    if not num:
        return ''
    buffer = ctypes.create_string_buffer('\0' * num)
    ctypes.windll.kernel32.GetEnvironmentVariableA(var, buffer, num)
    return buffer.value
	
def getCurrentFolder():
    """
    Get folder name of currently selected item.
    Also returns folder name, if file is selected.
    Returns empty string if nothing is selected.
    """
    return _getEnvVar('SHERLOXPLORER_CURRENT_DIRECTORY')

def getCurrentFile():
    """
    Get file name of currently selected item.
    Returns empty string if folder or nothing is selected.
    """
    return _getEnvVar('SHERLOXPLORER_FULL_CURRENT_PATH')
