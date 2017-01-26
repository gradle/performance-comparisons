package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_25 {
    private final Production29_25 production = new Production29_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}