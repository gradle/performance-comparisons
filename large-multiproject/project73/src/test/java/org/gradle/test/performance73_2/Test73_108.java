package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_108 {
    private final Production73_108 production = new Production73_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}