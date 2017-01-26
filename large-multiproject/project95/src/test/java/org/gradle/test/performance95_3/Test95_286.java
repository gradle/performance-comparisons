package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_286 {
    private final Production95_286 production = new Production95_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}