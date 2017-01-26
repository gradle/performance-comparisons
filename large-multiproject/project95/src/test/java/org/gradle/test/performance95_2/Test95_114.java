package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_114 {
    private final Production95_114 production = new Production95_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}