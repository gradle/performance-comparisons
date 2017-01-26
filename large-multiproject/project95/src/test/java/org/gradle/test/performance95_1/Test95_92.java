package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_92 {
    private final Production95_92 production = new Production95_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}