package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_58 {
    private final Production74_58 production = new Production74_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}