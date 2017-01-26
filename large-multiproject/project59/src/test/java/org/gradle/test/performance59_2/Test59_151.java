package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_151 {
    private final Production59_151 production = new Production59_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}