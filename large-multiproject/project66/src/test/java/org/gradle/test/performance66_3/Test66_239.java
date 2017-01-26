package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_239 {
    private final Production66_239 production = new Production66_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}