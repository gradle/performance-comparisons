package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_302 {
    private final Production66_302 production = new Production66_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}