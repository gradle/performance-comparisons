package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_174 {
    private final Production72_174 production = new Production72_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}