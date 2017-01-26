package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_409 {
    private final Production66_409 production = new Production66_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}