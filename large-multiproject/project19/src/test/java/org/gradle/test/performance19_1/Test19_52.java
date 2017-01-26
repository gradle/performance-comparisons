package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_52 {
    private final Production19_52 production = new Production19_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}