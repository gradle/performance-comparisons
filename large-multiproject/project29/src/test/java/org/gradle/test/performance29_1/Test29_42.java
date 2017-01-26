package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_42 {
    private final Production29_42 production = new Production29_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}