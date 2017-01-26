package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_440 {
    private final Production19_440 production = new Production19_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}