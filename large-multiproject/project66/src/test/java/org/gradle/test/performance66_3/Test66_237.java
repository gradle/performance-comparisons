package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_237 {
    private final Production66_237 production = new Production66_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}