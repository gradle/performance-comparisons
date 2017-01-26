package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_198 {
    private final Production45_198 production = new Production45_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}