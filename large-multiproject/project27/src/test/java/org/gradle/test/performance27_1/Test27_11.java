package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_11 {
    private final Production27_11 production = new Production27_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}