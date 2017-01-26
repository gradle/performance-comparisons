package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_6 {
    private final Production66_6 production = new Production66_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}