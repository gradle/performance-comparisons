package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_477 {
    private final Production19_477 production = new Production19_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}