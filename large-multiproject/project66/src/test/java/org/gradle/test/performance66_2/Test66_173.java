package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_173 {
    private final Production66_173 production = new Production66_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}