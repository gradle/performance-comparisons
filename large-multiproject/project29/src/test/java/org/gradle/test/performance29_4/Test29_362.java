package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_362 {
    private final Production29_362 production = new Production29_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}