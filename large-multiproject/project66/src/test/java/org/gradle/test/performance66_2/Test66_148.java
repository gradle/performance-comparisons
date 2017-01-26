package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_148 {
    private final Production66_148 production = new Production66_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}