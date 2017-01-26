package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_81 {
    private final Production19_81 production = new Production19_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}