package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_242 {
    private final Production66_242 production = new Production66_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}