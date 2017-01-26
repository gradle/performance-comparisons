package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_291 {
    private final Production49_291 production = new Production49_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}