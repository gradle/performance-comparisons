package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_238 {
    private final Production66_238 production = new Production66_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}