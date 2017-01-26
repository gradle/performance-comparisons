package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_258 {
    private final Production66_258 production = new Production66_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}