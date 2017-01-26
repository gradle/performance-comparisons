package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_212 {
    private final Production9_212 production = new Production9_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}