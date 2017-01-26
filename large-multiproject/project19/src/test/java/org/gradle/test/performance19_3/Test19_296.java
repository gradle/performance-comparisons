package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_296 {
    private final Production19_296 production = new Production19_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}