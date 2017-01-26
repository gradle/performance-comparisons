package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_296 {
    private final Production11_296 production = new Production11_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}