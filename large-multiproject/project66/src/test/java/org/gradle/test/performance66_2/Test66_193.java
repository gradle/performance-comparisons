package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_193 {
    private final Production66_193 production = new Production66_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}