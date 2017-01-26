package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_384 {
    private final Production66_384 production = new Production66_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}