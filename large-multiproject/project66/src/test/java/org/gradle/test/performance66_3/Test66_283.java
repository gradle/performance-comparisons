package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_283 {
    private final Production66_283 production = new Production66_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}