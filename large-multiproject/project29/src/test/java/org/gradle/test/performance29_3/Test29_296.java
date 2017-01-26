package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_296 {
    private final Production29_296 production = new Production29_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}