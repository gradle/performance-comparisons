package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_209 {
    private final Production74_209 production = new Production74_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}