package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_92 {
    private final Production66_92 production = new Production66_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}