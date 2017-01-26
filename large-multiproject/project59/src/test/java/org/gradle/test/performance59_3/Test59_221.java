package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_221 {
    private final Production59_221 production = new Production59_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}