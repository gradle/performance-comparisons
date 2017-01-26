package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_143 {
    private final Production59_143 production = new Production59_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}