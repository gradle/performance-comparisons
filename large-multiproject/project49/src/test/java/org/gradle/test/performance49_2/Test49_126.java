package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_126 {
    private final Production49_126 production = new Production49_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}