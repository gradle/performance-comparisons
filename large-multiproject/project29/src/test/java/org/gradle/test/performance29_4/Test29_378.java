package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_378 {
    private final Production29_378 production = new Production29_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}