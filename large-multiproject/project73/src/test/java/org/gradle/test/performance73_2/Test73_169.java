package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_169 {
    private final Production73_169 production = new Production73_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}