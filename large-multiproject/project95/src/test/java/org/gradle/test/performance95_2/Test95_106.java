package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_106 {
    private final Production95_106 production = new Production95_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}