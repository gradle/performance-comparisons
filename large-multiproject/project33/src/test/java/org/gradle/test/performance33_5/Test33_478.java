package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_478 {
    private final Production33_478 production = new Production33_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}