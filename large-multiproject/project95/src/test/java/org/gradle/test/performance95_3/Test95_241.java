package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_241 {
    private final Production95_241 production = new Production95_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}