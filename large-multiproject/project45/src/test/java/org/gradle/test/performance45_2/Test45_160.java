package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_160 {
    private final Production45_160 production = new Production45_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}