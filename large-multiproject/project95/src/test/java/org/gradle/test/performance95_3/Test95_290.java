package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_290 {
    private final Production95_290 production = new Production95_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}