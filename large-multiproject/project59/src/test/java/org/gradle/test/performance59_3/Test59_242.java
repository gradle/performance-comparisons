package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_242 {
    private final Production59_242 production = new Production59_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}