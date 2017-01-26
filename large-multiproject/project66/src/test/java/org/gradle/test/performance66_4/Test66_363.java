package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_363 {
    private final Production66_363 production = new Production66_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}