package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_151 {
    private final Production99_151 production = new Production99_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}