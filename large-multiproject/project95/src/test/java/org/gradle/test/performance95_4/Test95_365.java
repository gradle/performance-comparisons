package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_365 {
    private final Production95_365 production = new Production95_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}