package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_317 {
    private final Production59_317 production = new Production59_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}