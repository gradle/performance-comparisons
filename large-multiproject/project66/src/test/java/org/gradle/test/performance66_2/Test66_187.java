package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_187 {
    private final Production66_187 production = new Production66_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}