package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_177 {
    private final Production59_177 production = new Production59_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}