package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_64 {
    private final Production95_64 production = new Production95_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}