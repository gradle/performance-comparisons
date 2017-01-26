package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_268 {
    private final Production29_268 production = new Production29_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}