package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_15 {
    private final Production15_15 production = new Production15_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}