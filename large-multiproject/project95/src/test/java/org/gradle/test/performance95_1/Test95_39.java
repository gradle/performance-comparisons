package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_39 {
    private final Production95_39 production = new Production95_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}