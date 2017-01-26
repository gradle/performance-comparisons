package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_54 {
    private final Production19_54 production = new Production19_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}