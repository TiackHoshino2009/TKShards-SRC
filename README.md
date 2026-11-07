# TKShards

**TKShards** rewards players with Shards while they remain AFK on your Minecraft server. Create designated AFK zones where players can earn rewards over time, encourage them to stay active in your community, and give them ways to check, transfer, and compete for Shards.

The plugin includes player balance and payment commands, AFK zone management, AutoShard access, reward boosters, double-Shard potions, administrative balance controls, and leaderboards. Permissions let you control who receives specific rewards and who can manage the plugin.

## Features

- **AFK zone rewards:** Configure areas where players can earn Shards while AFK.
- **Balance checks:** View your own Shard balance or check another player’s balance.
- **Player-to-player transfers:** Let players send Shards to one another.
- **AutoShard:** Allow eligible players to receive Shards automatically at configured intervals.
- **Boosters and potions:** Give players Shard boosters or double-Shard potions.
- **Administrative controls:** Add, remove, or set player balances; manage AFK zones; and reload the configuration.
- **Leaderboards:** Let players view rankings for Shards, money, kills, deaths, and sales.
- **Permission-based settings:** Control administration, AutoShard access, AFK reward eligibility, exemptions, and reward boosts.

## Commands

### Player commands

| Command | Description |
|---|---|
| `/tkshards [player]` | View your Shard balance or check another player’s balance. Aliases: `/shards`, `/tks` |
| `/tkshardspay <player\|toggle> <amount>` | Transfer Shards to another player or use the `toggle` option. Alias: `/shardspay` |
| `/tkautoshard [player] [on\|off]` | Toggle AutoShard for yourself. With a player and `on` or `off`, an admin can grant or revoke it. Aliases: `/autoshard`, `/giveautoshard` |
| `/shard [player \| pay <player> <amount> \| time <player> <time>]` | Check a balance, transfer Shards, or adjust a player’s AFK time. |
| `/top <shard\|money\|kill\|die\|sell>` | View a leaderboard. |

### Admin commands

| Command | Description |
|---|---|
| `/tkshardsmanager <add\|remove\|set> <player> <amount>` | Add to, subtract from, or set a player’s Shard balance. Alias: `/shardsmanager` |
| `/tkshardsreload` | Reload the plugin configuration. Alias: `/shardsreload` |
| `/tkbooster <player> <duration>` | Give a player a Shard booster. Alias: `/givebooster` |
| `/tkzones <wand\|create\|remove\|list\|check>` | Manage the AFK zones used for Shard rewards. |
| `/tkpotion <player>` | Give a player a double-Shard potion. Alias: `/givepotion` |

## Permissions

| Permission | Description | Default |
|---|---|---|
| `tkshards.admin` | Full administrative access to TKShards. | Operator |
| `tkautoshard` | Allows a player to receive periodic AutoShard rewards; can be assigned through LuckPerms or by an admin/operator. | Disabled |
| `tkshards.everywhere` | Allows earning Shards from AFK anywhere, rather than only in an AFK zone. | Disabled |
| `tkshards.everywhere.exempt` | Exempts a player from the everywhere-reward permission, even if inherited through a wildcard permission such as `*`. | Disabled |
| `tkshards.boost.2` | Permission for the 2× Shard boost. | Disabled |
| `tkshards.boost.3` | Permission for the 3× Shard boost. | Disabled |
| `tkshards.boost.5` | Permission for the 5× Shard boost. | Disabled |

TKShards gives server owners tools to set up AFK-based Shard rewards while letting players manage and use their Shards through in-game commands.
