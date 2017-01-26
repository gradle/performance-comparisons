package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_378 {
    private final Production38_378 production = new Production38_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}