package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_139 {
    private final Production66_139 production = new Production66_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}