package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_356 {
    private final Production9_356 production = new Production9_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}