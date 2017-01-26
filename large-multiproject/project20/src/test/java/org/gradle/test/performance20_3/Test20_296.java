package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_296 {
    private final Production20_296 production = new Production20_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}