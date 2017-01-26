package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_22 {
    private final Production27_22 production = new Production27_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}