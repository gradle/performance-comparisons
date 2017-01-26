package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_446 {
    private final Production24_446 production = new Production24_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}