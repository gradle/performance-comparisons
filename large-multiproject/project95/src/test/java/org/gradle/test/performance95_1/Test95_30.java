package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_30 {
    private final Production95_30 production = new Production95_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}