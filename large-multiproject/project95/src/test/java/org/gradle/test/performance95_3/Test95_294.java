package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_294 {
    private final Production95_294 production = new Production95_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}