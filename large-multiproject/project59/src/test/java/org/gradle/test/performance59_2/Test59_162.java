package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_162 {
    private final Production59_162 production = new Production59_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}