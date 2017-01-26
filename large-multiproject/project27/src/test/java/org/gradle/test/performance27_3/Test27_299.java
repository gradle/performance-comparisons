package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_299 {
    private final Production27_299 production = new Production27_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}