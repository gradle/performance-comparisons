package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_126 {
    private final Production74_126 production = new Production74_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}