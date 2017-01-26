package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_174 {
    private final Production73_174 production = new Production73_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}