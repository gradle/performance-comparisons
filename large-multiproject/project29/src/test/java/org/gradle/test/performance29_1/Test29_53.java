package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_53 {
    private final Production29_53 production = new Production29_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}