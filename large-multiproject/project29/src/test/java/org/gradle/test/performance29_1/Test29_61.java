package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_61 {
    private final Production29_61 production = new Production29_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}