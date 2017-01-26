package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_126 {
    private final Production62_126 production = new Production62_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}