package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_345 {
    private final Production66_345 production = new Production66_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}