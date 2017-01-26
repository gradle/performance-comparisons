package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_66 {
    private final Production95_66 production = new Production95_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}