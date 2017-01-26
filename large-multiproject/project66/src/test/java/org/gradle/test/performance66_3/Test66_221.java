package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_221 {
    private final Production66_221 production = new Production66_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}