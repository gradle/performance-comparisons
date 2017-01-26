package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_462 {
    private final Production95_462 production = new Production95_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}