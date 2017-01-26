package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_246 {
    private final Production9_246 production = new Production9_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}