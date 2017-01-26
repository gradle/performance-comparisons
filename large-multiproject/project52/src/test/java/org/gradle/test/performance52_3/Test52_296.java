package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_296 {
    private final Production52_296 production = new Production52_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}