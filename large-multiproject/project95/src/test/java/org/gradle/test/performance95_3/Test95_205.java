package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_205 {
    private final Production95_205 production = new Production95_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}