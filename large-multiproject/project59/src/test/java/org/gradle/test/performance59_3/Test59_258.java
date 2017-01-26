package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_258 {
    private final Production59_258 production = new Production59_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}