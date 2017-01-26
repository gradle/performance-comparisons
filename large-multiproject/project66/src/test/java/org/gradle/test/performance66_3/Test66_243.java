package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_243 {
    private final Production66_243 production = new Production66_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}