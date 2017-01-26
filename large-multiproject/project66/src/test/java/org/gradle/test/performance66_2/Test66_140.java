package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_140 {
    private final Production66_140 production = new Production66_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}