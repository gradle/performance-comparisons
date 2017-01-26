package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_312 {
    private final Production45_312 production = new Production45_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}