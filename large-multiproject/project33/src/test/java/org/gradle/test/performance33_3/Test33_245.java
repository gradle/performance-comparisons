package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_245 {
    private final Production33_245 production = new Production33_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}