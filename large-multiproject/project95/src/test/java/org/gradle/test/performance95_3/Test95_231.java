package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_231 {
    private final Production95_231 production = new Production95_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}