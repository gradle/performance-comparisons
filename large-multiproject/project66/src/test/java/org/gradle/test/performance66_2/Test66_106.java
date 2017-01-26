package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_106 {
    private final Production66_106 production = new Production66_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}