package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_291 {
    private final Production7_291 production = new Production7_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}