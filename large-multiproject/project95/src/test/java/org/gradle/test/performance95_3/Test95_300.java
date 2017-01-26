package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_300 {
    private final Production95_300 production = new Production95_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}