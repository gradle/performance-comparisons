package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_330 {
    private final Production95_330 production = new Production95_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}