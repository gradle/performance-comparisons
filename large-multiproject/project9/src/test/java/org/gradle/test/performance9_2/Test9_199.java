package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_199 {
    private final Production9_199 production = new Production9_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}