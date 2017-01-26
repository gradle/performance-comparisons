package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_203 {
    private final Production66_203 production = new Production66_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}