package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_310 {
    private final Production66_310 production = new Production66_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}