package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_107 {
    private final Production95_107 production = new Production95_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}