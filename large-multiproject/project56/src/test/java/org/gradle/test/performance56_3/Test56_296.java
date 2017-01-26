package org.gradle.test.performance56_3;

import static org.junit.Assert.*;

public class Test56_296 {
    private final Production56_296 production = new Production56_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}