package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_485 {
    private final Production66_485 production = new Production66_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}