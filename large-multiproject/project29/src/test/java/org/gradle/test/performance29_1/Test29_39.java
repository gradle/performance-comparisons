package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_39 {
    private final Production29_39 production = new Production29_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}