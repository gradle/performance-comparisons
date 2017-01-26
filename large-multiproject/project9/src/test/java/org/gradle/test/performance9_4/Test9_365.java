package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_365 {
    private final Production9_365 production = new Production9_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}