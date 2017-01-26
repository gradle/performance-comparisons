package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_188 {
    private final Production19_188 production = new Production19_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}