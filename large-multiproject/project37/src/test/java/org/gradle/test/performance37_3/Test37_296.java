package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_296 {
    private final Production37_296 production = new Production37_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}