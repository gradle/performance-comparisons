package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_20 {
    private final Production95_20 production = new Production95_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}