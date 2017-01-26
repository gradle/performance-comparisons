package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_274 {
    private final Production66_274 production = new Production66_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}