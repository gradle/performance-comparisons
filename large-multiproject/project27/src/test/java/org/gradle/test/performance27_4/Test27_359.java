package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_359 {
    private final Production27_359 production = new Production27_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}