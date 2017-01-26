package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_193 {
    private final Production19_193 production = new Production19_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}