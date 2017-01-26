package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_203 {
    private final Production19_203 production = new Production19_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}