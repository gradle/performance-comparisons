package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_401 {
    private final Production95_401 production = new Production95_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}