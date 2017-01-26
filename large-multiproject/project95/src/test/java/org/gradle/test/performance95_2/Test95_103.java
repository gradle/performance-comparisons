package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_103 {
    private final Production95_103 production = new Production95_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}