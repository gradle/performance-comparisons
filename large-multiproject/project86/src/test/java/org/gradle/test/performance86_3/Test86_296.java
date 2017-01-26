package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_296 {
    private final Production86_296 production = new Production86_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}