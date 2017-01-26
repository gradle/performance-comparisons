package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_174 {
    private final Production66_174 production = new Production66_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}