package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_174 {
    private final Production85_174 production = new Production85_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}