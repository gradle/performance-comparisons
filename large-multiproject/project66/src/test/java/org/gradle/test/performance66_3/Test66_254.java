package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_254 {
    private final Production66_254 production = new Production66_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}