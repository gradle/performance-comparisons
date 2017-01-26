package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_272 {
    private final Production95_272 production = new Production95_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}