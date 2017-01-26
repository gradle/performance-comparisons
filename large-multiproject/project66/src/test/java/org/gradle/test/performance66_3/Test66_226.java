package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_226 {
    private final Production66_226 production = new Production66_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}