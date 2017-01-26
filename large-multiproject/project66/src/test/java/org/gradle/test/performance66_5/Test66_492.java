package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_492 {
    private final Production66_492 production = new Production66_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}