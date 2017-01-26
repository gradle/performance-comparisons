package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_183 {
    private final Production13_183 production = new Production13_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}