package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_152 {
    private final Production95_152 production = new Production95_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}