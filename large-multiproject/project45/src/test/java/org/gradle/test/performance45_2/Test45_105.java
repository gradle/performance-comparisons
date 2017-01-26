package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_105 {
    private final Production45_105 production = new Production45_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}