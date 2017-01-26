package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_75 {
    private final Production95_75 production = new Production95_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}