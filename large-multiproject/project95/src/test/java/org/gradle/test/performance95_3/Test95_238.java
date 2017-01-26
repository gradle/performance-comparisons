package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_238 {
    private final Production95_238 production = new Production95_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}