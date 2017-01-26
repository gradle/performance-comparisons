package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_270 {
    private final Production66_270 production = new Production66_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}