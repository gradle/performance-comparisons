package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_296 {
    private final Production66_296 production = new Production66_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}