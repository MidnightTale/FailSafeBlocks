# FailSafe Blocks

FailSafe Blocks is a NeoForge mod that fixes the problem of missing blocks when you remove a mod.

## Problem

When you install a mod that adds new blocks and use those blocks in your world, then later remove that mod, Minecraft will remove those blocks from your world, leaving ugly holes.

## Solution

FailSafe Blocks uses mixins to intercept the chunk loading process. When a block is detected as missing (usually from a removed mod), instead of allowing it to disappear completely, FailSafe Blocks replaces it with a placeholder block. This keeps your structures intact even when mods are removed.

## Features

- Replaces missing blocks with a visible placeholder block
- Helps preserve the structure of your builds when mods are removed
- Works seamlessly in the background
- Compatible with most Minecraft mods

## Configuration

Currently, there are no configuration options. The mod simply works out of the box.

## For Developers

This mod uses Mixins to intercept the chunk loading process. The main components are:

1. `MixinChunkSerializer` - Intercepts the chunk loading process to detect and replace missing blocks
2. `MissingBlockTracker` - Utility class to detect invalid block states
3. `ModBlocks` - Contains the placeholder block definition

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Credits

Created by MidnightTale 