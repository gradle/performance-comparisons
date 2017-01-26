package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_296 {
    private final Production45_296 production = new Production45_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}