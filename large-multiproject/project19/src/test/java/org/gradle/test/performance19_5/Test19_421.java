package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_421 {
    private final Production19_421 production = new Production19_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}