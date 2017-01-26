package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_259 {
    private final Production95_259 production = new Production95_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}