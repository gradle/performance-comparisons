package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_78 {
    private final Production9_78 production = new Production9_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}