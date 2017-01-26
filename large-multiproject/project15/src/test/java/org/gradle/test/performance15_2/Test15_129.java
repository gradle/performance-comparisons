package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_129 {
    private final Production15_129 production = new Production15_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}