package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_276 {
    private final Production73_276 production = new Production73_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}