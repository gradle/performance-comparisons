package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_500 {
    private final Production87_500 production = new Production87_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}