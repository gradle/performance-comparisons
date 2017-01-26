package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_56 {
    private final Production59_56 production = new Production59_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}