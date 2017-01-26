package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_124 {
    private final Production45_124 production = new Production45_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}