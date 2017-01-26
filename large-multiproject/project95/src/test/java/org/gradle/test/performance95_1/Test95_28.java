package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_28 {
    private final Production95_28 production = new Production95_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}