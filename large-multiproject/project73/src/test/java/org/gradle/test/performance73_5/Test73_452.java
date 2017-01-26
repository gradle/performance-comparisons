package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_452 {
    private final Production73_452 production = new Production73_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}