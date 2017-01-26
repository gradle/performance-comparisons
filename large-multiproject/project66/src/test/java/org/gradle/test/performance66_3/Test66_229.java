package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_229 {
    private final Production66_229 production = new Production66_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}