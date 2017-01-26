package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_174 {
    private final Production30_174 production = new Production30_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}