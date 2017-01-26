package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_174 {
    private final Production24_174 production = new Production24_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}