package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_256 {
    private final Production45_256 production = new Production45_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}