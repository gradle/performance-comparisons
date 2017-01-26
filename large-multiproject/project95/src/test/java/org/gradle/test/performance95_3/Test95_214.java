package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_214 {
    private final Production95_214 production = new Production95_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}