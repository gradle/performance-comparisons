package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_5 {
    private final Production66_5 production = new Production66_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}