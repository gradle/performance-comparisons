package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_379 {
    private final Production95_379 production = new Production95_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}