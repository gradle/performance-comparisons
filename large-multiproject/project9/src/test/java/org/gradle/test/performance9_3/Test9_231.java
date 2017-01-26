package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_231 {
    private final Production9_231 production = new Production9_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}