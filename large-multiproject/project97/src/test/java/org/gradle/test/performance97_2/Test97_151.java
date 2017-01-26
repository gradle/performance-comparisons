package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_151 {
    private final Production97_151 production = new Production97_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}