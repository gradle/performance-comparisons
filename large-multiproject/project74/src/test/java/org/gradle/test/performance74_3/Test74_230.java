package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_230 {
    private final Production74_230 production = new Production74_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}