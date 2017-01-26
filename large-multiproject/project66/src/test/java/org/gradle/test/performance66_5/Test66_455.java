package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_455 {
    private final Production66_455 production = new Production66_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}