package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_294 {
    private final Production9_294 production = new Production9_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}