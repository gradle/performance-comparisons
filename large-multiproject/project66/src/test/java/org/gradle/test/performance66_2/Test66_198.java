package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_198 {
    private final Production66_198 production = new Production66_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}