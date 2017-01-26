package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_120 {
    private final Production45_120 production = new Production45_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}