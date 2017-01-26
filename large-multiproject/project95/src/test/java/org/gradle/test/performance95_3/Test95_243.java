package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_243 {
    private final Production95_243 production = new Production95_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}