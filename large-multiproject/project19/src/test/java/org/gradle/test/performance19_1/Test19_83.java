package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_83 {
    private final Production19_83 production = new Production19_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}