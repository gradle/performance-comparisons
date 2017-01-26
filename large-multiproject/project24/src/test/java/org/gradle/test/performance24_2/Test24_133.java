package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_133 {
    private final Production24_133 production = new Production24_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}