package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_35 {
    private final Production95_35 production = new Production95_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}