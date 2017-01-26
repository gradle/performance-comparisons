package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_302 {
    private final Production95_302 production = new Production95_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}