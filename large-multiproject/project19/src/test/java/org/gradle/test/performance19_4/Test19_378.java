package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_378 {
    private final Production19_378 production = new Production19_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}