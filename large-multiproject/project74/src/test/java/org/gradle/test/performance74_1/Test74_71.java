package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_71 {
    private final Production74_71 production = new Production74_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}