package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_160 {
    private final Production66_160 production = new Production66_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}