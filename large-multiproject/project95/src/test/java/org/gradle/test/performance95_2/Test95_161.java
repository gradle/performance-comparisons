package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_161 {
    private final Production95_161 production = new Production95_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}