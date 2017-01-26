package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_91 {
    private final Production74_91 production = new Production74_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}