package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_296 {
    private final Production33_296 production = new Production33_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}