package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_443 {
    private final Production73_443 production = new Production73_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}