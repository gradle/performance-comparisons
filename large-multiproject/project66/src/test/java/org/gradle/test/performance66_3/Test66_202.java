package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_202 {
    private final Production66_202 production = new Production66_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}