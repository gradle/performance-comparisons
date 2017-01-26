package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_117 {
    private final Production33_117 production = new Production33_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}