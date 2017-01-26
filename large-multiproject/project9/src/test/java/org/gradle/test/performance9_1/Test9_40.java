package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_40 {
    private final Production9_40 production = new Production9_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}