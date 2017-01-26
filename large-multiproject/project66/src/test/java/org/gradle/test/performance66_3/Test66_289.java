package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_289 {
    private final Production66_289 production = new Production66_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}