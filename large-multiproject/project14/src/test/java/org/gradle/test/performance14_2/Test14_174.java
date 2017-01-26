package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_174 {
    private final Production14_174 production = new Production14_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}