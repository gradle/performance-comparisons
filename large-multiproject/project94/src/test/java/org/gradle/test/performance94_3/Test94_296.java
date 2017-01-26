package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_296 {
    private final Production94_296 production = new Production94_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}