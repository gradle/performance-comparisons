package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_177 {
    private final Production95_177 production = new Production95_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}