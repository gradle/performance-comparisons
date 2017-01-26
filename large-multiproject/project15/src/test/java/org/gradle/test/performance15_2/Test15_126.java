package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_126 {
    private final Production15_126 production = new Production15_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}