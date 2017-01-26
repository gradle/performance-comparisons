package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_71 {
    private final Production95_71 production = new Production95_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}