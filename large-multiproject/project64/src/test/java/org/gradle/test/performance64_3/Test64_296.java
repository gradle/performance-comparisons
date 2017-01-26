package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_296 {
    private final Production64_296 production = new Production64_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}