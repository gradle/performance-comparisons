package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_54 {
    private final Production66_54 production = new Production66_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}