package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_10 {
    private final Production95_10 production = new Production95_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}