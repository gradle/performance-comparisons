package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_29 {
    private final Production9_29 production = new Production9_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}