package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_474 {
    private final Production74_474 production = new Production74_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}