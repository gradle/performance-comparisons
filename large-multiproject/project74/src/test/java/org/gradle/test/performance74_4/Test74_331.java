package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_331 {
    private final Production74_331 production = new Production74_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}