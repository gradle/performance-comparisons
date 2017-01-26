package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_75 {
    private final Production74_75 production = new Production74_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}