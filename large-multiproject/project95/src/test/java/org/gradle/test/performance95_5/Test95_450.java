package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_450 {
    private final Production95_450 production = new Production95_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}