package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_164 {
    private final Production95_164 production = new Production95_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}