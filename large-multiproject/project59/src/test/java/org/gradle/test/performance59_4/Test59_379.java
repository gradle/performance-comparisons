package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_379 {
    private final Production59_379 production = new Production59_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}