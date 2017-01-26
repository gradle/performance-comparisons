package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_334 {
    private final Production66_334 production = new Production66_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}