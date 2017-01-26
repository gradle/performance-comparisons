package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_378 {
    private final Production51_378 production = new Production51_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}