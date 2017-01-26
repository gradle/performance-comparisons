package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_169 {
    private final Production95_169 production = new Production95_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}