package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_190 {
    private final Production95_190 production = new Production95_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}