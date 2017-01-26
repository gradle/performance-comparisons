package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_296 {
    private final Production85_296 production = new Production85_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}