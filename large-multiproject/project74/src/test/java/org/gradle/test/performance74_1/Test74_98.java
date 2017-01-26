package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_98 {
    private final Production74_98 production = new Production74_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}