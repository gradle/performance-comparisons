package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_57 {
    private final Production95_57 production = new Production95_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}