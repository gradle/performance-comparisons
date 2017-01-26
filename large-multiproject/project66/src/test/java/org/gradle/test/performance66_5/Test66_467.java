package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_467 {
    private final Production66_467 production = new Production66_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}