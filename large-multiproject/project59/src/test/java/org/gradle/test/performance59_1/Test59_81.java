package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_81 {
    private final Production59_81 production = new Production59_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}