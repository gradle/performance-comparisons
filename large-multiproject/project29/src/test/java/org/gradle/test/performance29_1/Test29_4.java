package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_4 {
    private final Production29_4 production = new Production29_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}