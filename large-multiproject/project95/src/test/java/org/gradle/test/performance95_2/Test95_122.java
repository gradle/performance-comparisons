package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_122 {
    private final Production95_122 production = new Production95_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}