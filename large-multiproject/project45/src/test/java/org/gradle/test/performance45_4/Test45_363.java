package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_363 {
    private final Production45_363 production = new Production45_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}