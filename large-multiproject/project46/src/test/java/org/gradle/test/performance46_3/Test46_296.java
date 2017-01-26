package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_296 {
    private final Production46_296 production = new Production46_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}