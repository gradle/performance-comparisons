package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_114 {
    private final Production66_114 production = new Production66_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}