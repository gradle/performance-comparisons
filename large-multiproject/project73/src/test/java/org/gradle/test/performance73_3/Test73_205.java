package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_205 {
    private final Production73_205 production = new Production73_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}