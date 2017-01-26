package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_7 {
    private final Production66_7 production = new Production66_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}