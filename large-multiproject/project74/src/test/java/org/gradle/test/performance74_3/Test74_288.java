package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_288 {
    private final Production74_288 production = new Production74_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}