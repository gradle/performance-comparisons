package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_294 {
    private final Production29_294 production = new Production29_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}