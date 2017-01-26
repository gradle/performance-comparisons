package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_500 {
    private final Production95_500 production = new Production95_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}