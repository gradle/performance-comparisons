package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_3 {
    private final Production95_3 production = new Production95_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}