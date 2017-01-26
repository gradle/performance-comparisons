package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_29 {
    private final Production66_29 production = new Production66_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}