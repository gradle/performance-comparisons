package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_472 {
    private final Production7_472 production = new Production7_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}