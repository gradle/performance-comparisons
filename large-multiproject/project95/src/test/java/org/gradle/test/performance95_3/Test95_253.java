package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_253 {
    private final Production95_253 production = new Production95_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}