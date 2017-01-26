package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_342 {
    private final Production19_342 production = new Production19_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}