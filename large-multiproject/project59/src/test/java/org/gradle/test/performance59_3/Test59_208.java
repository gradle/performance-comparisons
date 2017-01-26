package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_208 {
    private final Production59_208 production = new Production59_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}