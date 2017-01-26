package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_57 {
    private final Production66_57 production = new Production66_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}