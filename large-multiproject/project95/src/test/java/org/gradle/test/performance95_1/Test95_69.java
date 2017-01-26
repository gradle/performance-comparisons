package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_69 {
    private final Production95_69 production = new Production95_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}