package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_31 {
    private final Production95_31 production = new Production95_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}