package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_413 {
    private final Production27_413 production = new Production27_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}