package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_323 {
    private final Production66_323 production = new Production66_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}