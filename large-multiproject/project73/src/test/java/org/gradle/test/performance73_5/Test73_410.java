package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_410 {
    private final Production73_410 production = new Production73_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}