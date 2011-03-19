package org.ikikko

println 'Hello, groovy Eclipse coompiler!'

// TODO mainにGroovyソースが１つもないと、エラーががが。このため、テストのみGroovyを実行するような構成が組めないんだよー

// TODO build-helper-pluginがadd-test-sourcesをソースフォルダに認識してくれない。
// 手動でつっこめば認識してくれるけど、更新しなおしたらまた除外されちゃう
// - https://issues.sonatype.org/browse/MNGECLIPSE-2387
