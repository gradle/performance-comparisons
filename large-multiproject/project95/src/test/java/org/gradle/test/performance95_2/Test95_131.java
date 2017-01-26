package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_131 {
    private final Production95_131 production = new Production95_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}