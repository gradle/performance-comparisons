package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_133 {
    private final Production7_133 production = new Production7_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}