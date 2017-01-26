package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_296 {
    private final Production79_296 production = new Production79_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}