package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_296 {
    private final Production34_296 production = new Production34_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}