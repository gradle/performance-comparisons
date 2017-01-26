package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_164 {
    private final Production66_164 production = new Production66_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}