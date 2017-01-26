package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_151 {
    private final Production95_151 production = new Production95_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}