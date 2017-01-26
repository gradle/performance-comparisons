package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_119 {
    private final Production74_119 production = new Production74_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}