package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_381 {
    private final Production95_381 production = new Production95_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}