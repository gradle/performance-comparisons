package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_296 {
    private final Production24_296 production = new Production24_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}