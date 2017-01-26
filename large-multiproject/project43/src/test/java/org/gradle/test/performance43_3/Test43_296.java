package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_296 {
    private final Production43_296 production = new Production43_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}