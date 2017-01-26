package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_212 {
    private final Production95_212 production = new Production95_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}