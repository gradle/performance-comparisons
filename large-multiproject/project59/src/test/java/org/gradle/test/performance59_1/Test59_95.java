package org.gradle.test.performance59_1;

import static org.junit.Assert.*;

public class Test59_95 {
    private final Production59_95 production = new Production59_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}