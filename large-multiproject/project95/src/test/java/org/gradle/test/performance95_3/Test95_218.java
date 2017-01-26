package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_218 {
    private final Production95_218 production = new Production95_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}