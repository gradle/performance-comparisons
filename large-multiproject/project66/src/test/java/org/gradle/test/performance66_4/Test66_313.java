package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_313 {
    private final Production66_313 production = new Production66_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}