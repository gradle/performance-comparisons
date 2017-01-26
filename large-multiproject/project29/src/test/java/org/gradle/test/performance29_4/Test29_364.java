package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_364 {
    private final Production29_364 production = new Production29_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}