package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_133 {
    private final Production92_133 production = new Production92_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}