package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_72 {
    private final Production74_72 production = new Production74_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}