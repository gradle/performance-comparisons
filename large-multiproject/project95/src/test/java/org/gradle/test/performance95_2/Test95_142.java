package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_142 {
    private final Production95_142 production = new Production95_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}