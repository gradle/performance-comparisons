package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_37 {
    private final Production66_37 production = new Production66_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}