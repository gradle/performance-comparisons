package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_339 {
    private final Production19_339 production = new Production19_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}