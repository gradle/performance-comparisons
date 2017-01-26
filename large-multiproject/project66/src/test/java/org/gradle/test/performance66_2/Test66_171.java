package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_171 {
    private final Production66_171 production = new Production66_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}