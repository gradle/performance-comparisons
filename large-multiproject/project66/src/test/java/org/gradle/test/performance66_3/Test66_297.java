package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_297 {
    private final Production66_297 production = new Production66_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}