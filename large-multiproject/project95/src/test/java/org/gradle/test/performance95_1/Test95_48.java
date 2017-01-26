package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_48 {
    private final Production95_48 production = new Production95_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}