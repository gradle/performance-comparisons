package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_378 {
    private final Production36_378 production = new Production36_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}