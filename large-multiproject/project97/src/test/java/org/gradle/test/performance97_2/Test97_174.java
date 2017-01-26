package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_174 {
    private final Production97_174 production = new Production97_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}