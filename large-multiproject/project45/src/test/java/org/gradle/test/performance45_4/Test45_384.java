package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_384 {
    private final Production45_384 production = new Production45_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}