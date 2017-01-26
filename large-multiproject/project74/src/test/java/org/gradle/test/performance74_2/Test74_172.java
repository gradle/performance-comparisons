package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_172 {
    private final Production74_172 production = new Production74_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}