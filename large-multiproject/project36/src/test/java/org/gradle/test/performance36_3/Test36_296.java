package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_296 {
    private final Production36_296 production = new Production36_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}