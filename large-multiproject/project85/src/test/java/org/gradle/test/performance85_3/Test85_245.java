package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_245 {
    private final Production85_245 production = new Production85_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}