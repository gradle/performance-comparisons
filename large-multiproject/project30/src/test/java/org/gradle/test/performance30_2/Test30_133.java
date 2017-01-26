package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_133 {
    private final Production30_133 production = new Production30_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}