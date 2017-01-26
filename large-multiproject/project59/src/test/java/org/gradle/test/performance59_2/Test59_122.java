package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_122 {
    private final Production59_122 production = new Production59_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}