package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_424 {
    private final Production95_424 production = new Production95_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}