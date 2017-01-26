package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_235 {
    private final Production59_235 production = new Production59_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}