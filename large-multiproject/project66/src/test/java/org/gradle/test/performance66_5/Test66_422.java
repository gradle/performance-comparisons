package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_422 {
    private final Production66_422 production = new Production66_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}