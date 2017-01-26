package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_275 {
    private final Production73_275 production = new Production73_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}