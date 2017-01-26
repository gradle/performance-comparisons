package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_1 {
    private final Production95_1 production = new Production95_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}