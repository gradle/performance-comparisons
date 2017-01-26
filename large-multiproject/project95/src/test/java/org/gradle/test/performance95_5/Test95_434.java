package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_434 {
    private final Production95_434 production = new Production95_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}