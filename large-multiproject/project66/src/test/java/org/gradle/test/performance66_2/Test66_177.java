package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_177 {
    private final Production66_177 production = new Production66_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}