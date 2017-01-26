package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_249 {
    private final Production66_249 production = new Production66_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}