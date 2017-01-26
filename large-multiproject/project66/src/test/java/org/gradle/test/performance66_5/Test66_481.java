package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_481 {
    private final Production66_481 production = new Production66_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}