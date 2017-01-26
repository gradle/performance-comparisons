package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_301 {
    private final Production73_301 production = new Production73_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}