package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_136 {
    private final Production66_136 production = new Production66_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}