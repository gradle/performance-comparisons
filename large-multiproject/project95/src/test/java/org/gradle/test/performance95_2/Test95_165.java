package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_165 {
    private final Production95_165 production = new Production95_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}