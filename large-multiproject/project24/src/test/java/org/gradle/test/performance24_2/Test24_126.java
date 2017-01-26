package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_126 {
    private final Production24_126 production = new Production24_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}