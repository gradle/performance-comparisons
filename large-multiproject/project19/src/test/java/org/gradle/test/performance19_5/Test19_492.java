package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_492 {
    private final Production19_492 production = new Production19_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}