package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_367 {
    private final Production29_367 production = new Production29_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}