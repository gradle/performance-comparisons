package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_25 {
    private final Production9_25 production = new Production9_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}