package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_8 {
    private final Production66_8 production = new Production66_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}