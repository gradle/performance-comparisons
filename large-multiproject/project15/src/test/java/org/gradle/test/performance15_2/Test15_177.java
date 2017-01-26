package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_177 {
    private final Production15_177 production = new Production15_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}