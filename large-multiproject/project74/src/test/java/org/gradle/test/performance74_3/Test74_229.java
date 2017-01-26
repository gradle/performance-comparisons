package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_229 {
    private final Production74_229 production = new Production74_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}