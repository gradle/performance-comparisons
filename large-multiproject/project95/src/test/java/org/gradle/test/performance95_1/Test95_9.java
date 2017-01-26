package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_9 {
    private final Production95_9 production = new Production95_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}