package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_168 {
    private final Production74_168 production = new Production74_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}