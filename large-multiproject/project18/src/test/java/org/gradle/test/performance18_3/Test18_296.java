package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_296 {
    private final Production18_296 production = new Production18_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}