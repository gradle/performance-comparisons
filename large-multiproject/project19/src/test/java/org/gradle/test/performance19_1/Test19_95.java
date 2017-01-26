package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_95 {
    private final Production19_95 production = new Production19_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}