package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_150 {
    private final Production95_150 production = new Production95_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}