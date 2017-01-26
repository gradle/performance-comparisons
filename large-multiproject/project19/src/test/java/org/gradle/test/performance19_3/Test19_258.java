package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_258 {
    private final Production19_258 production = new Production19_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}