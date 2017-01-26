package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_381 {
    private final Production66_381 production = new Production66_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}