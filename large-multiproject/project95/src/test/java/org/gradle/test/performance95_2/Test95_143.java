package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_143 {
    private final Production95_143 production = new Production95_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}