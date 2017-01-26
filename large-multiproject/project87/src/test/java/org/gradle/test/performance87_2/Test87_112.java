package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_112 {
    private final Production87_112 production = new Production87_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}