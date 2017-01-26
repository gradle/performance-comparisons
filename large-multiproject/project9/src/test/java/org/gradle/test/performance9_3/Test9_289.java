package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_289 {
    private final Production9_289 production = new Production9_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}