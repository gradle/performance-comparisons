package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_226 {
    private final Production19_226 production = new Production19_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}