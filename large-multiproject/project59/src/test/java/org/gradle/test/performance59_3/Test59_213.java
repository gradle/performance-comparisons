package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_213 {
    private final Production59_213 production = new Production59_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}