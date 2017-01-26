package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_132 {
    private final Production27_132 production = new Production27_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}