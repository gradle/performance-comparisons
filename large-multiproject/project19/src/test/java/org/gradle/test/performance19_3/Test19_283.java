package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_283 {
    private final Production19_283 production = new Production19_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}