package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_179 {
    private final Production73_179 production = new Production73_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}