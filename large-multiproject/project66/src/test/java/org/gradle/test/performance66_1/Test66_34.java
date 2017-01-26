package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_34 {
    private final Production66_34 production = new Production66_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}