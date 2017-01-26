package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_84 {
    private final Production66_84 production = new Production66_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}