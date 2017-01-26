package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_62 {
    private final Production9_62 production = new Production9_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}