package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_358 {
    private final Production9_358 production = new Production9_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}