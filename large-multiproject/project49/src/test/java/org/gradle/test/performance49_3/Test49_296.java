package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_296 {
    private final Production49_296 production = new Production49_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}