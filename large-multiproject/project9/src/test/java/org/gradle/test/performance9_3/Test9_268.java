package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_268 {
    private final Production9_268 production = new Production9_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}