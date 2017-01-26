package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_305 {
    private final Production29_305 production = new Production29_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}