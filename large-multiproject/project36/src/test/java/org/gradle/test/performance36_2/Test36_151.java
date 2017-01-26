package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_151 {
    private final Production36_151 production = new Production36_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}