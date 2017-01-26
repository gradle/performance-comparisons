package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_53 {
    private final Production95_53 production = new Production95_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}