package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_489 {
    private final Production73_489 production = new Production73_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}