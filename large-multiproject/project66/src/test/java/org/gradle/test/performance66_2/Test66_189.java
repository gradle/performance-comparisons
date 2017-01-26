package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_189 {
    private final Production66_189 production = new Production66_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}