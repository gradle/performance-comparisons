package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_252 {
    private final Production66_252 production = new Production66_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}