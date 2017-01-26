package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_303 {
    private final Production29_303 production = new Production29_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}