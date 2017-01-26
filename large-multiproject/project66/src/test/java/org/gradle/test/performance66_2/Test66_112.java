package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_112 {
    private final Production66_112 production = new Production66_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}