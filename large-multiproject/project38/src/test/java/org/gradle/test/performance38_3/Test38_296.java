package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_296 {
    private final Production38_296 production = new Production38_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}