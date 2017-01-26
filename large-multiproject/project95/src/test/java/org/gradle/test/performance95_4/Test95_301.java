package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_301 {
    private final Production95_301 production = new Production95_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}