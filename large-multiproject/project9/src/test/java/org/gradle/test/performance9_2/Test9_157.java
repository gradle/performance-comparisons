package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_157 {
    private final Production9_157 production = new Production9_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}