package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_126 {
    private final Production60_126 production = new Production60_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}