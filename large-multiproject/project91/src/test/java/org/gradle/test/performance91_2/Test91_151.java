package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_151 {
    private final Production91_151 production = new Production91_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}