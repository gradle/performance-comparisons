package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_115 {
    private final Production95_115 production = new Production95_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}