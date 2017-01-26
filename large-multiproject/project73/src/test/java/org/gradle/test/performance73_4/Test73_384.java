package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_384 {
    private final Production73_384 production = new Production73_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}