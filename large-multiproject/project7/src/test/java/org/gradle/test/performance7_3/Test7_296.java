package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_296 {
    private final Production7_296 production = new Production7_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}