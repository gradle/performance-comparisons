package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_157 {
    private final Production74_157 production = new Production74_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}