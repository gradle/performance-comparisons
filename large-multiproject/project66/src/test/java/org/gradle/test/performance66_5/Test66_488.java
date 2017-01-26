package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_488 {
    private final Production66_488 production = new Production66_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}