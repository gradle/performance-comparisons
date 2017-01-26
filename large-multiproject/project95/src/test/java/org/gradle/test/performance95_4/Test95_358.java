package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_358 {
    private final Production95_358 production = new Production95_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}