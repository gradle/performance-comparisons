package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_472 {
    private final Production27_472 production = new Production27_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}