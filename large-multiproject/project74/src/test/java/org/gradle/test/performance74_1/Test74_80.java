package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_80 {
    private final Production74_80 production = new Production74_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}