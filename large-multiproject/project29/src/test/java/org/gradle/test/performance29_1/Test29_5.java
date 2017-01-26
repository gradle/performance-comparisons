package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_5 {
    private final Production29_5 production = new Production29_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}