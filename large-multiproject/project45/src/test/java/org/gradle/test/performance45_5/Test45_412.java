package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_412 {
    private final Production45_412 production = new Production45_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}