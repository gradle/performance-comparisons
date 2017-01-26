package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_75 {
    private final Production9_75 production = new Production9_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}