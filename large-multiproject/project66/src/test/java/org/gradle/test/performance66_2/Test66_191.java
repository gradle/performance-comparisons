package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_191 {
    private final Production66_191 production = new Production66_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}