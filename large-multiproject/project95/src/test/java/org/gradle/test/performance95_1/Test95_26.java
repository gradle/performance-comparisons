package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_26 {
    private final Production95_26 production = new Production95_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}