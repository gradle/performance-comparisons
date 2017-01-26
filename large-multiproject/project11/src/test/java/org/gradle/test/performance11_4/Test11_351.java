package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_351 {
    private final Production11_351 production = new Production11_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}