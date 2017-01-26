package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_256 {
    private final Production27_256 production = new Production27_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}