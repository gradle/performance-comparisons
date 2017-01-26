package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_223 {
    private final Production73_223 production = new Production73_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}