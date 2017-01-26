package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_153 {
    private final Production27_153 production = new Production27_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}