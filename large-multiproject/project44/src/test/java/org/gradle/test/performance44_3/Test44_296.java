package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_296 {
    private final Production44_296 production = new Production44_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}