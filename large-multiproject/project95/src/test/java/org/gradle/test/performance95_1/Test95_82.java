package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_82 {
    private final Production95_82 production = new Production95_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}