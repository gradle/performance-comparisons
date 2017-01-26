package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_405 {
    private final Production95_405 production = new Production95_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}