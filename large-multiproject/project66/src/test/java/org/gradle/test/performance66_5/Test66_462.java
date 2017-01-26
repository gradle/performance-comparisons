package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_462 {
    private final Production66_462 production = new Production66_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}