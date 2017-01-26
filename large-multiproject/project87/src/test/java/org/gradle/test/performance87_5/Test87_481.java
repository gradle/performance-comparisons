package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_481 {
    private final Production87_481 production = new Production87_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}