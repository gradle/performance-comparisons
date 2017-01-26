package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_334 {
    private final Production45_334 production = new Production45_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}