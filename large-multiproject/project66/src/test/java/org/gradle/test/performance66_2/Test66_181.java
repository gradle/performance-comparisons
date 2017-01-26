package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_181 {
    private final Production66_181 production = new Production66_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}