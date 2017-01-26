package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_100 {
    private final Production9_100 production = new Production9_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}