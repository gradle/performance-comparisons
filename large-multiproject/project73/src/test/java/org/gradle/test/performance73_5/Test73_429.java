package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_429 {
    private final Production73_429 production = new Production73_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}