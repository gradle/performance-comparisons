package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_296 {
    private final Production89_296 production = new Production89_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}