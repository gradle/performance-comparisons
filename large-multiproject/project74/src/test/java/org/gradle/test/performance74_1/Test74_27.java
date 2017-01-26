package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_27 {
    private final Production74_27 production = new Production74_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}