package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_500 {
    private final Production66_500 production = new Production66_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}