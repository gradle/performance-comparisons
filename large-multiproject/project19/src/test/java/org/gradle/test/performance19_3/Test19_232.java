package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_232 {
    private final Production19_232 production = new Production19_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}