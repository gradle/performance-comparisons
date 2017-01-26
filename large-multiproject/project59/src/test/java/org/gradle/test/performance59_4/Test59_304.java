package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_304 {
    private final Production59_304 production = new Production59_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}