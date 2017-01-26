package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_151 {
    private final Production38_151 production = new Production38_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}