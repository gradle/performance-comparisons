package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_145 {
    private final Production66_145 production = new Production66_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}