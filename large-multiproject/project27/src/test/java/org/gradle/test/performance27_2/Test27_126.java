package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_126 {
    private final Production27_126 production = new Production27_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}