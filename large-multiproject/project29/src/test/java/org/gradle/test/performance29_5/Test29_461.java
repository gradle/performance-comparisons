package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_461 {
    private final Production29_461 production = new Production29_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}