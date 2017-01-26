package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_54 {
    private final Production95_54 production = new Production95_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}