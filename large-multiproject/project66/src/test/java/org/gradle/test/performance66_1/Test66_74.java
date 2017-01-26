package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_74 {
    private final Production66_74 production = new Production66_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}