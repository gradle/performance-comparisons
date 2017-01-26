package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_116 {
    private final Production73_116 production = new Production73_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}