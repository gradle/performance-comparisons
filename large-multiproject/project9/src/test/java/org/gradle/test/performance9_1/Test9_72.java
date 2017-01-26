package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_72 {
    private final Production9_72 production = new Production9_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}