package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_113 {
    private final Production95_113 production = new Production95_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}