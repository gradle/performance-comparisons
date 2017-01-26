package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_459 {
    private final Production66_459 production = new Production66_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}