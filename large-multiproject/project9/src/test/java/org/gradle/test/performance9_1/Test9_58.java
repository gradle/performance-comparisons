package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_58 {
    private final Production9_58 production = new Production9_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}