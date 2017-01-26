package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_235 {
    private final Production66_235 production = new Production66_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}