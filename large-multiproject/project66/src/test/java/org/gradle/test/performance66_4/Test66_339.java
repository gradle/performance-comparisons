package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_339 {
    private final Production66_339 production = new Production66_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}