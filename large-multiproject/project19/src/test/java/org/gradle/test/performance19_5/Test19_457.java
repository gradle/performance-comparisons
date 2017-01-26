package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_457 {
    private final Production19_457 production = new Production19_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}