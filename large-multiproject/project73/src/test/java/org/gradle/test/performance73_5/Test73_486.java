package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_486 {
    private final Production73_486 production = new Production73_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}