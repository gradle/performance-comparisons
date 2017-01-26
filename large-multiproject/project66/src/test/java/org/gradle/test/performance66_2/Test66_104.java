package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_104 {
    private final Production66_104 production = new Production66_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}