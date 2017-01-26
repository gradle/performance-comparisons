package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_271 {
    private final Production27_271 production = new Production27_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}