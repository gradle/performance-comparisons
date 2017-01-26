package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_296 {
    private final Production81_296 production = new Production81_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}