package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_71 {
    private final Production9_71 production = new Production9_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}