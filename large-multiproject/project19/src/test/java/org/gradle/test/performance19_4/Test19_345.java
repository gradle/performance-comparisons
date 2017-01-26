package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_345 {
    private final Production19_345 production = new Production19_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}