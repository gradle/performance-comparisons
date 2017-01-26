package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_151 {
    private final Production90_151 production = new Production90_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}