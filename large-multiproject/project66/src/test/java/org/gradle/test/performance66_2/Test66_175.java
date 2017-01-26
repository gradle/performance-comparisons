package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_175 {
    private final Production66_175 production = new Production66_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}