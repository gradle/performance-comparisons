package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_147 {
    private final Production66_147 production = new Production66_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}