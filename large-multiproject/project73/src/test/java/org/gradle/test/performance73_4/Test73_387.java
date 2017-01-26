package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_387 {
    private final Production73_387 production = new Production73_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}