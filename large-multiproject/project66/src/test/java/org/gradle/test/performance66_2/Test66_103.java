package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_103 {
    private final Production66_103 production = new Production66_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}