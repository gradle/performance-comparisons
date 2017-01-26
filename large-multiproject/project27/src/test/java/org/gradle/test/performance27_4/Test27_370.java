package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_370 {
    private final Production27_370 production = new Production27_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}