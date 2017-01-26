package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_166 {
    private final Production74_166 production = new Production74_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}