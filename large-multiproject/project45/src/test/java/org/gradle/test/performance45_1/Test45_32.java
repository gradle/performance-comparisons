package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_32 {
    private final Production45_32 production = new Production45_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}