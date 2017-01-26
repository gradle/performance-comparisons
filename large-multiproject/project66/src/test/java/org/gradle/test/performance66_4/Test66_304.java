package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_304 {
    private final Production66_304 production = new Production66_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}