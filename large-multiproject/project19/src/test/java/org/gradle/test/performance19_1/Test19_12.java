package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_12 {
    private final Production19_12 production = new Production19_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}