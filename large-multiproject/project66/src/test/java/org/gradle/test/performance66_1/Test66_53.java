package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_53 {
    private final Production66_53 production = new Production66_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}