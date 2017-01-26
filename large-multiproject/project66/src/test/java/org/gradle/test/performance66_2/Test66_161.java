package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_161 {
    private final Production66_161 production = new Production66_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}