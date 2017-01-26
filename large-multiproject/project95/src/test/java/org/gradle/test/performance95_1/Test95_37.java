package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_37 {
    private final Production95_37 production = new Production95_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}