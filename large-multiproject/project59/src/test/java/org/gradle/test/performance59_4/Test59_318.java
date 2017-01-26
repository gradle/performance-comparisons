package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_318 {
    private final Production59_318 production = new Production59_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}