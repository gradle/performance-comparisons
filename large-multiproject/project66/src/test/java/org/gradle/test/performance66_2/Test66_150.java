package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_150 {
    private final Production66_150 production = new Production66_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}