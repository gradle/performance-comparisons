package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_76 {
    private final Production9_76 production = new Production9_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}