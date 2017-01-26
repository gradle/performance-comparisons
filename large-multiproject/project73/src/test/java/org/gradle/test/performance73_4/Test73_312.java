package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_312 {
    private final Production73_312 production = new Production73_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}