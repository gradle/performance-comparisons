package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_266 {
    private final Production9_266 production = new Production9_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}