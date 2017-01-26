package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_16 {
    private final Production59_16 production = new Production59_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}