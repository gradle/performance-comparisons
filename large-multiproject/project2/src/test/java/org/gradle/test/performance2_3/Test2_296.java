package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_296 {
    private final Production2_296 production = new Production2_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}