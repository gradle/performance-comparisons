package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_354 {
    private final Production66_354 production = new Production66_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}