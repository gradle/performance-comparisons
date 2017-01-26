package org.gradle.test.performance57_3;

import static org.junit.Assert.*;

public class Test57_296 {
    private final Production57_296 production = new Production57_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}