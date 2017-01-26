package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_200 {
    private final Production95_200 production = new Production95_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}