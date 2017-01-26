package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_296 {
    private final Production59_296 production = new Production59_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}