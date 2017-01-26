package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_216 {
    private final Production59_216 production = new Production59_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}