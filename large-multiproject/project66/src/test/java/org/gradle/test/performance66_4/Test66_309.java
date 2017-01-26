package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_309 {
    private final Production66_309 production = new Production66_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}