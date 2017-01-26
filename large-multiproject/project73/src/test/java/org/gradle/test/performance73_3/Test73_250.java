package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_250 {
    private final Production73_250 production = new Production73_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}