properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '')), disableConcurrentBuilds(), parameters([string(defaultValue: 'bar', description: '', name: 'Foo')]), [$class: 'JobPropertyImpl', throttle: [count: 1, durationName: 'hour']], pipelineTriggers([])])

