package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_74 {
    private final Production19_74 production = new Production19_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}