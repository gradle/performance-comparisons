package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_351 {
    private final Production34_351 production = new Production34_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}