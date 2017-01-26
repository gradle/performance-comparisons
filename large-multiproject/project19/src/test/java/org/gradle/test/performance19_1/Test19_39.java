package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_39 {
    private final Production19_39 production = new Production19_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}