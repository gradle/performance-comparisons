package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_18 {
    private final Production59_18 production = new Production59_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}