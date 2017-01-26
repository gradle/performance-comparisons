package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_25 {
    private final Production74_25 production = new Production74_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}