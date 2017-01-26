package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_292 {
    private final Production33_292 production = new Production33_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}