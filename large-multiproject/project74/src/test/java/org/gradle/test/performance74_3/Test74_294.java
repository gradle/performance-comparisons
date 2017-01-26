package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_294 {
    private final Production74_294 production = new Production74_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}