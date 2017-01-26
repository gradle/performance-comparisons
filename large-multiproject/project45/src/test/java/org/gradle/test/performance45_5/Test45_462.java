package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_462 {
    private final Production45_462 production = new Production45_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}