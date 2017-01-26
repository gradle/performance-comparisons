package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_333 {
    private final Production66_333 production = new Production66_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}