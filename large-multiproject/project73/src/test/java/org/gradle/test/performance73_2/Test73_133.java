package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_133 {
    private final Production73_133 production = new Production73_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}