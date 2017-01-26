package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_296 {
    private final Production39_296 production = new Production39_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}