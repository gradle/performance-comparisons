package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_420 {
    private final Production66_420 production = new Production66_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}