package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_296 {
    private final Production71_296 production = new Production71_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}