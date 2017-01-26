package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_12 {
    private final Production59_12 production = new Production59_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}