package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_152 {
    private final Production59_152 production = new Production59_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}