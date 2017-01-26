package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_126 {
    private final Production30_126 production = new Production30_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}