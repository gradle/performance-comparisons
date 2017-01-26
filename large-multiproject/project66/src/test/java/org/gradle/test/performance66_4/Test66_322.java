package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_322 {
    private final Production66_322 production = new Production66_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}