package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_52 {
    private final Production66_52 production = new Production66_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}