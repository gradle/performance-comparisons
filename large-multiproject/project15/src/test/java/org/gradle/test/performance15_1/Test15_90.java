package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_90 {
    private final Production15_90 production = new Production15_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}