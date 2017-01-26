package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_178 {
    private final Production66_178 production = new Production66_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}