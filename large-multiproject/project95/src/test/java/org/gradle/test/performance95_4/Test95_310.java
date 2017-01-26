package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_310 {
    private final Production95_310 production = new Production95_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}