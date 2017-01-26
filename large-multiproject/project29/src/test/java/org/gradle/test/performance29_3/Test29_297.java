package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_297 {
    private final Production29_297 production = new Production29_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}