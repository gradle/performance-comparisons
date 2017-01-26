package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_345 {
    private final Production95_345 production = new Production95_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}