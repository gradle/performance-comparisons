package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_291 {
    private final Production45_291 production = new Production45_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}