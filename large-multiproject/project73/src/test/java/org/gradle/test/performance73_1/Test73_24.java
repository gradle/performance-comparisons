package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_24 {
    private final Production73_24 production = new Production73_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}