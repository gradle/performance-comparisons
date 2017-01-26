package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_160 {
    private final Production95_160 production = new Production95_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}