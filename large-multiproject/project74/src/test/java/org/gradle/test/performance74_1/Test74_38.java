package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_38 {
    private final Production74_38 production = new Production74_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}