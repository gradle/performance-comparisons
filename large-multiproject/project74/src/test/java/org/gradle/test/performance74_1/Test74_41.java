package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_41 {
    private final Production74_41 production = new Production74_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}