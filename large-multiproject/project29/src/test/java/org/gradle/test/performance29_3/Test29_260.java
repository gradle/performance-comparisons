package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_260 {
    private final Production29_260 production = new Production29_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}