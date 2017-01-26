package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_349 {
    private final Production95_349 production = new Production95_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}