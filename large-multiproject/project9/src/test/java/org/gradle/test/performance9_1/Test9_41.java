package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_41 {
    private final Production9_41 production = new Production9_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}