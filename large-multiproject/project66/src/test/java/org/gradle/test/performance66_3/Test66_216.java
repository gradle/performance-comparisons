package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_216 {
    private final Production66_216 production = new Production66_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}