package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_64 {
    private final Production66_64 production = new Production66_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}