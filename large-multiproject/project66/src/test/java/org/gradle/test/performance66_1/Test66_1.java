package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_1 {
    private final Production66_1 production = new Production66_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}