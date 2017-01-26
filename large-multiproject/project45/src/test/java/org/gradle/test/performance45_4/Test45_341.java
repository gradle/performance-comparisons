package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_341 {
    private final Production45_341 production = new Production45_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}