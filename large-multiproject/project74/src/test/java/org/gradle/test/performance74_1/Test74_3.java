package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_3 {
    private final Production74_3 production = new Production74_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}