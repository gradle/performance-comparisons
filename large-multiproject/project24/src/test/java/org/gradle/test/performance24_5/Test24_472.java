package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_472 {
    private final Production24_472 production = new Production24_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}