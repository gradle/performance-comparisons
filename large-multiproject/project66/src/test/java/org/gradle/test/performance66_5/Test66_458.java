package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_458 {
    private final Production66_458 production = new Production66_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}