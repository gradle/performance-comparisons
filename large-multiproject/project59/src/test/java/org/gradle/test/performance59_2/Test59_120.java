package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_120 {
    private final Production59_120 production = new Production59_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}