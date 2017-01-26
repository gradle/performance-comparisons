package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_423 {
    private final Production95_423 production = new Production95_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}