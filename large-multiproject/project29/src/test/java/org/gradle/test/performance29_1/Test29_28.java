package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_28 {
    private final Production29_28 production = new Production29_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}