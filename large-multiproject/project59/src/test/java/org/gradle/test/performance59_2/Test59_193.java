package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_193 {
    private final Production59_193 production = new Production59_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}