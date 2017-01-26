package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_361 {
    private final Production29_361 production = new Production29_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}