package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_171 {
    private final Production95_171 production = new Production95_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}