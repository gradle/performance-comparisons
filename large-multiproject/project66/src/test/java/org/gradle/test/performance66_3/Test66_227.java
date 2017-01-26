package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_227 {
    private final Production66_227 production = new Production66_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}