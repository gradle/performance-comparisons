package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_441 {
    private final Production19_441 production = new Production19_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}