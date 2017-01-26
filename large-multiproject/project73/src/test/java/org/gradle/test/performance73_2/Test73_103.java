package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_103 {
    private final Production73_103 production = new Production73_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}