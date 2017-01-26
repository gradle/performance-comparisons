package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_296 {
    private final Production10_296 production = new Production10_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}