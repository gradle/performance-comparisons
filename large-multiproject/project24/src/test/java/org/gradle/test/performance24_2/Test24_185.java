package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_185 {
    private final Production24_185 production = new Production24_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}