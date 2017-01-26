package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_321 {
    private final Production19_321 production = new Production19_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}