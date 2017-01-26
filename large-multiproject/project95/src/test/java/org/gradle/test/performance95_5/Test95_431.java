package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_431 {
    private final Production95_431 production = new Production95_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}