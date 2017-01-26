package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_95 {
    private final Production66_95 production = new Production66_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}