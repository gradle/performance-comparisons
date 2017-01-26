package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_441 {
    private final Production66_441 production = new Production66_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}