package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_239 {
    private final Production95_239 production = new Production95_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}