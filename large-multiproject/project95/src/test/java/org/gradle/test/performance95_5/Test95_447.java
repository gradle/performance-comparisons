package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_447 {
    private final Production95_447 production = new Production95_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}