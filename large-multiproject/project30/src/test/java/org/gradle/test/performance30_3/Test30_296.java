package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_296 {
    private final Production30_296 production = new Production30_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}