package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_84 {
    private final Production95_84 production = new Production95_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}