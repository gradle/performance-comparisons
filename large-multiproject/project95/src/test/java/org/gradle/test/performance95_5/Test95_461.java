package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_461 {
    private final Production95_461 production = new Production95_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}