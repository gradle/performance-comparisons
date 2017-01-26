package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_296 {
    private final Production95_296 production = new Production95_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}