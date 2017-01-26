package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_208 {
    private final Production15_208 production = new Production15_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}