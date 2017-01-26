package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_61 {
    private final Production74_61 production = new Production74_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}