package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_185 {
    private final Production45_185 production = new Production45_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}