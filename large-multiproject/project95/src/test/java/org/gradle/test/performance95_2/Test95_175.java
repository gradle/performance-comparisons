package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_175 {
    private final Production95_175 production = new Production95_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}