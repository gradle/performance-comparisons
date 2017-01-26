package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_392 {
    private final Production29_392 production = new Production29_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}