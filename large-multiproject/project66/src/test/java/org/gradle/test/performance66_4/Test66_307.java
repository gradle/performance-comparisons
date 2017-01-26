package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_307 {
    private final Production66_307 production = new Production66_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}