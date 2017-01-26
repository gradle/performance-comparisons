package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_70 {
    private final Production95_70 production = new Production95_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}