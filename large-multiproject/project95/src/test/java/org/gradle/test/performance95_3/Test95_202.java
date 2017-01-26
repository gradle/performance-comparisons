package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_202 {
    private final Production95_202 production = new Production95_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}