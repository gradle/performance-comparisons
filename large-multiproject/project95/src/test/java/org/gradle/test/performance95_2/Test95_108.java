package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_108 {
    private final Production95_108 production = new Production95_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}