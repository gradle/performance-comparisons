package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_20 {
    private final Production73_20 production = new Production73_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}