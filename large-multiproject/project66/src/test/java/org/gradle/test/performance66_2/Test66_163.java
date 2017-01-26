package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_163 {
    private final Production66_163 production = new Production66_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}