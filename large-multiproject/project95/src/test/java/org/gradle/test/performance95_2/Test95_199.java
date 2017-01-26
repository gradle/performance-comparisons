package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_199 {
    private final Production95_199 production = new Production95_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}