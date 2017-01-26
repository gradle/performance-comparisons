package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_320 {
    private final Production29_320 production = new Production29_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}