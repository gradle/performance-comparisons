package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_476 {
    private final Production66_476 production = new Production66_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}