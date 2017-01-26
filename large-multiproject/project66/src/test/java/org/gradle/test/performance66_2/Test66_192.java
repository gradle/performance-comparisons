package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_192 {
    private final Production66_192 production = new Production66_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}