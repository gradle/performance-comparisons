package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_296 {
    private final Production60_296 production = new Production60_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}