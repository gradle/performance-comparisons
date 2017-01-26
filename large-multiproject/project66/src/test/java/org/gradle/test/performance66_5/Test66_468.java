package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_468 {
    private final Production66_468 production = new Production66_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}