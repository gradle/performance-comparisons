package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_35 {
    private final Production66_35 production = new Production66_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}