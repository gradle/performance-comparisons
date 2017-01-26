package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_249 {
    private final Production59_249 production = new Production59_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}