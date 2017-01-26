package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_218 {
    private final Production59_218 production = new Production59_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}