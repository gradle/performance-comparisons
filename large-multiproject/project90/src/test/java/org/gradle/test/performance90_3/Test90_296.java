package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_296 {
    private final Production90_296 production = new Production90_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}