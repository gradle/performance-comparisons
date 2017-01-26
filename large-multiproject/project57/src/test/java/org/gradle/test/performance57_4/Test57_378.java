package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_378 {
    private final Production57_378 production = new Production57_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}