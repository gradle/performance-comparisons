package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_125 {
    private final Production95_125 production = new Production95_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}