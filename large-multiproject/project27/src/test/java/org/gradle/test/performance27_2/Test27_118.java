package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_118 {
    private final Production27_118 production = new Production27_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}