package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_324 {
    private final Production29_324 production = new Production29_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}