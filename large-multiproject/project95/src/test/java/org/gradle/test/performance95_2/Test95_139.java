package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_139 {
    private final Production95_139 production = new Production95_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}