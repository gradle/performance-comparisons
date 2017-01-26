package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_456 {
    private final Production66_456 production = new Production66_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}