package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_174 {
    private final Production27_174 production = new Production27_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}