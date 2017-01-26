package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_299 {
    private final Production73_299 production = new Production73_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}