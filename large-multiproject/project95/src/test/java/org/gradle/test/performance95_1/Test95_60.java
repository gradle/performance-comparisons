package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_60 {
    private final Production95_60 production = new Production95_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}