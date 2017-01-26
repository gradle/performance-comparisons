package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_418 {
    private final Production66_418 production = new Production66_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}