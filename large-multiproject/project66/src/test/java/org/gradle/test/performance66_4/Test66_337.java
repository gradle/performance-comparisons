package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_337 {
    private final Production66_337 production = new Production66_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}