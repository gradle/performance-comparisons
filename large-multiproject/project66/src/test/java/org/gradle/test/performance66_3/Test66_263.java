package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_263 {
    private final Production66_263 production = new Production66_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}