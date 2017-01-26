package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_296 {
    private final Production87_296 production = new Production87_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}