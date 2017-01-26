package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_129 {
    private final Production95_129 production = new Production95_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}