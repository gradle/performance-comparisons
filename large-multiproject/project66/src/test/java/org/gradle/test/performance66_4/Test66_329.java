package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_329 {
    private final Production66_329 production = new Production66_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}