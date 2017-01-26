package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_149 {
    private final Production95_149 production = new Production95_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}