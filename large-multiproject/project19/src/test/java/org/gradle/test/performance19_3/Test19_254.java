package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_254 {
    private final Production19_254 production = new Production19_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}