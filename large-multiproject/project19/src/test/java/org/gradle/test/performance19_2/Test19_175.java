package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_175 {
    private final Production19_175 production = new Production19_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}