package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_54 {
    private final Production59_54 production = new Production59_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}