package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_500 {
    private final Production9_500 production = new Production9_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}