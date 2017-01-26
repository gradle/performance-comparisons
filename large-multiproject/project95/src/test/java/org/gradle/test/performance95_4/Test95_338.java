package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_338 {
    private final Production95_338 production = new Production95_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}