package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_405 {
    private final Production66_405 production = new Production66_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}