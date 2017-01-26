package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_249 {
    private final Production95_249 production = new Production95_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}