package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_170 {
    private final Production45_170 production = new Production45_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}