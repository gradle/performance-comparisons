package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_390 {
    private final Production95_390 production = new Production95_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}