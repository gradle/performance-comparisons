package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_400 {
    private final Production66_400 production = new Production66_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}