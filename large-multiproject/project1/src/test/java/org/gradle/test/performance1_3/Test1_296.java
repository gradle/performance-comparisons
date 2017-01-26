package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_296 {
    private final Production1_296 production = new Production1_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}