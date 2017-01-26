package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_370 {
    private final Production15_370 production = new Production15_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}