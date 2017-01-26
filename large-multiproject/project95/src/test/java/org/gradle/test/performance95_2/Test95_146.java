package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_146 {
    private final Production95_146 production = new Production95_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}