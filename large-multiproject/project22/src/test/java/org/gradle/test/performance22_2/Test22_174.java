package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_174 {
    private final Production22_174 production = new Production22_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}