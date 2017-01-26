package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_225 {
    private final Production74_225 production = new Production74_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}