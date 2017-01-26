package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_220 {
    private final Production66_220 production = new Production66_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}