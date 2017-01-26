package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_476 {
    private final Production95_476 production = new Production95_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}