package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_170 {
    private final Production24_170 production = new Production24_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}