package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_20 {
    private final Production45_20 production = new Production45_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}