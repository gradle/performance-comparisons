package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_497 {
    private final Production66_497 production = new Production66_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}