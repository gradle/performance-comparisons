package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_210 {
    private final Production66_210 production = new Production66_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}