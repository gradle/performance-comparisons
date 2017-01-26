package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_485 {
    private final Production59_485 production = new Production59_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}