package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_300 {
    private final Production74_300 production = new Production74_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}