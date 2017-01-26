package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_134 {
    private final Production74_134 production = new Production74_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}