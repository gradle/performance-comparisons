package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_379 {
    private final Production66_379 production = new Production66_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}