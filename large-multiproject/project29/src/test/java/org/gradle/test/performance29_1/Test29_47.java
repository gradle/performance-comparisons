package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_47 {
    private final Production29_47 production = new Production29_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}