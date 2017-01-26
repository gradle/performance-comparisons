package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_134 {
    private final Production66_134 production = new Production66_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}