package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_20 {
    private final Production27_20 production = new Production27_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}