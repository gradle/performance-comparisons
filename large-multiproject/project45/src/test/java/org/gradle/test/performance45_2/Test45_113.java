package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_113 {
    private final Production45_113 production = new Production45_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}