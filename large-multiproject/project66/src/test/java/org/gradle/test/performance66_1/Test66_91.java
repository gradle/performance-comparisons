package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_91 {
    private final Production66_91 production = new Production66_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}