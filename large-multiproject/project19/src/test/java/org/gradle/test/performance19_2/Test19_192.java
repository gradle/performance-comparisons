package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_192 {
    private final Production19_192 production = new Production19_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}