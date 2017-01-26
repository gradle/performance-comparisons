package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_311 {
    private final Production95_311 production = new Production95_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}