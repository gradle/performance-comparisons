package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_378 {
    private final Production46_378 production = new Production46_378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}