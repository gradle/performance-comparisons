package org.gradle.test.performance9_2;

import static org.junit.Assert.*;

public class Test9_107 {
    private final Production9_107 production = new Production9_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}