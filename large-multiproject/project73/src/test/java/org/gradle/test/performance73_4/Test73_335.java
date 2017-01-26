package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_335 {
    private final Production73_335 production = new Production73_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}