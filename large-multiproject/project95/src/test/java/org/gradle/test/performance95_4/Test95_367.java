package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_367 {
    private final Production95_367 production = new Production95_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}