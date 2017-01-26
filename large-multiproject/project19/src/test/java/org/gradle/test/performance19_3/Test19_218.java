package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_218 {
    private final Production19_218 production = new Production19_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}