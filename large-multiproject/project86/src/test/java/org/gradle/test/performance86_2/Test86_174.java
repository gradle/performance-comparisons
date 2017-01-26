package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_174 {
    private final Production86_174 production = new Production86_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}