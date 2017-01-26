package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_251 {
    private final Production74_251 production = new Production74_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}